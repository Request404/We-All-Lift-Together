import axios from 'axios'

export function asyn(config) {
  const instance = axios.create({
    baseURL: 'http://localhost:8081',
    timeout: 10000
  })

  return instance(config)
}