<script setup lang="ts">
import { onMounted, ref } from 'vue'
import { getArticleList } from '@/api/article'

const articles = ref([])
const getArticles = async (current: number, size: number) => {
  const res = await getArticleList(current, size)
  articles.value = await res.json()
  console.log(articles.value)
}
onMounted(() => {
  getArticles(1, 5)
})
</script>

<template>article</template>

<style scoped></style>
