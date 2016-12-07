package com.tina.main;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import java.io.IOException;

/**
 * Created by Administrator on 2016/12/6.
 */
public class HeaderFilter implements ContainerResponseFilter {
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        MultivaluedMap<String, Object> header = containerResponseContext.getHeaders();
        header.add("Access-Control-Allow-Origin", "*");
        header.add("Access-Control-Allow-Methods", "PUT,POST,GET,DELETE,OPTIONS");
        header.add("Access-Control-Allow-Headers", "x-requested-with,content-type");
    }
}
