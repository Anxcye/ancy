import axios from 'axios'
import { ElMessage } from 'element-plus'

const apiUrl = import.meta.env.DEV ? '/api/admin' : '/api/admin'

const instance = axios.create({
  baseURL: apiUrl,
  timeout: 10000,
  headers: { 'X-Custom-Header': 'foobar' }
})
// 添加请求拦截器
instance.interceptors.request.use(
  function (config) {
    // 在发送请求之前做些什么
    return config
  },
  function (error) {
    // 对请求错误做些什么
    return Promise.reject(error)
  }
)

// 添加响应拦截器
instance.interceptors.response.use(
  (res) => {
    if (res.data.code === 0) {
      return res
    }
    ElMessage.error(res.data.message || 'Unknown Error')
    return Promise.reject(res.data)
  },

  (err) => {
    ElMessage.error(err.response.data.message || 'Unknown Error')
    return Promise.reject(err)
  }
)

export default instance
