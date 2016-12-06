import User from './index'

export default (routes) => {
  routes.push(
    {
      path: '/user',
      component: User
    }
  )
}
