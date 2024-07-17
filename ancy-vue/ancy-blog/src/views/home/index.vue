<template>
  <div>
    <h1>Home</h1>
    <article-item
      v-for="article in articles"
      :key="article.id"
      :article="article"
    />
  </div>
</template>
<script setup lang="ts">
import ArticleItem from '@/views/home/components/articleItem.vue'
import { getArticleList } from '@/api/articles'
import { onMounted, ref } from 'vue'

const articles = ref([])
const getArticles = async () => {
  const res = await getArticleList()
  articles.value = res.data.data
}

onMounted(() => {
  getArticles()
})
</script>
