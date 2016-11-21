package com.oocl.shop;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ShopTest {

	@Test
	public void shouldHaveAShop() {
		// Could new a shop.
		Shop shop = new Shop();

		assertNotNull(shop);
	}

	@Test
	public void shopCanAddAPig() {
		Shop shop = new Shop();

		Pig pig = new Pig("Tina");
		shop.add(pig);
		assertEquals("Tina", pig.getName());
		assertEquals(1, shop.getPigs().size());

		Pig pig1 = new Pig("William");
		shop.add(pig);
		assertEquals("William", pig1.getName());
		assertEquals(2, shop.getPigs().size());
	}

	@Test
	public void shopCanAddACat() {
		Shop shop = new Shop();

		Cat pig = new Cat("Tina");
		shop.add(pig);
		assertEquals("Tina", pig.getName());
		assertEquals(1, shop.getCats().size());

		Cat pig1 = new Cat("William");
		shop.add(pig);
		assertEquals("William", pig1.getName());
		assertEquals(2, shop.getCats().size());
	}

}
