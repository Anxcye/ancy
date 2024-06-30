<script setup lang="ts">
const buttons = [
  { type: '', text: '首页', path: '/' },
  { type: '', text: '文章', path: '/articles' },
  { type: '', text: '日常', path: '/daily' },
  { type: '', text: '留言', path: '/messages' },
  { type: '', text: '关于', path: '/about' }
]

import { useRouter } from 'vue-router'
const router = useRouter()

const handleClick = (path: string) => {
  router.push(path)
}
</script>

<template>
  <div id="router-link">
    <el-button
      class="button"
      v-for="button in buttons"
      :key="button.text"
      :type="button.type"
      text
      @click="() => handleClick(button.path)"
    >
      {{ button.text }}
    </el-button>
  </div>
  <div>
    <router-view />
  </div>
</template>

<style scoped>
#router-link {
  display: flex;
  justify-content: center;
  margin: 20px 0;
}
.button {
  margin: 0 10px;
}
</style>
