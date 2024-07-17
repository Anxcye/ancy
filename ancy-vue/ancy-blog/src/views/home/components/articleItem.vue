<script setup lang="ts">
defineProps({
  article: Object
})
</script>

<template>
  <div id="item">
    <h3>{{ article.title }}</h3>
  </div>
</template>

<style scoped>
#item {
  margin: 20px 0;
  border: 1px solid #ccc;
}
</style>
