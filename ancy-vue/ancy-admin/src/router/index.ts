import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/login', component: () => import('@/views/login/index.vue') },
    {
      path: '/',
      component: () => import('@/views/layout/index.vue'),
      redirect: '/statistic',
      children: [
        {
          path: '/statistic',
          component: () => import('@/views/layout/statistic/index.vue')
        },
        {
          path: '/article',
          component: () => import('@/views/layout/article/index.vue')
        },
        {
          path: '/daily',
          component: () => import('@/views/layout/daily/index.vue')
        },
        {
          path: '/comment',
          component: () => import('@/views/layout/comment/index.vue')
        },
        {
          path: '/tag',
          component: () => import('@/views/layout/tag/index.vue')
        },
        {
          path: '/category',
          component: () => import('@/views/layout/category/index.vue')
        },
        {
          path: '/user',
          component: () => import('@/views/layout/user/index.vue')
        },
        {
          path: '/friend',
          component: () => import('@/views/layout/friend/index.vue')
        },
        {
          path: '/profile',
          component: () => import('@/views/layout/profile/index.vue')
        },
        {
          path: '/setting',
          component: () => import('@/views/layout/setting/index.vue')
        }
      ]
    }
  ]
})

export default router
