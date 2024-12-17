// 存放和面经相关的请求
import request from '@/utils/request'

// 分页获取面经列表的请求
export function articleAPI (params) {
  return request({
    url: '/h5/interview/query',
    params: params
  })
}
