import { createRouter, createWebHistory } from 'vue-router'

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    { path: '/', component: () => import('@/views/home/index.vue') },
    {
      path: '/articles',
      component: () => import('@/views/articles/index.vue')
    },
    { path: '/daily', component: () => import('@/views/daily/index.vue') },
    {
      path: '/messages',
      component: () => import('@/views/messages/index.vue')
    },
    { path: '/about', component: () => import('@/views/about/index.vue') }
  ]
})

export default router
