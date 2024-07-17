import request from '@/utils/request'

export const getArticleList = () => {
  return request({
    url: '/articles',
    method: 'get'
  })
}
