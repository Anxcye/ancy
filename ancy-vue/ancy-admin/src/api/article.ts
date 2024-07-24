import request from '@/utils/request'

export const getArticleList = (current: number, size: number) => {
  return request({
    url: '/articles/list',
    method: 'get',
    params: {
      current,
      size
    }
  })
}
