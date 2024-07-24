<script setup lang="ts">
import {
  ChatDotRound,
  DataAnalysis,
  Document,
  House,
  Link as LinkIcon,
  More,
  PriceTag,
  Setting,
  Star,
  User
} from '@element-plus/icons-vue'
</script>

<template>
  <el-row>
    <h1>Ancy</h1>
    <div class="flex-grow" />
    <div class="user-info">
      <el-avatar
        shape="square"
        size="large"
        src="https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif"
      />
      <div class="user-name">Ancy</div>
    </div>
  </el-row>
  <el-row class="tac">
    <el-col :span="4">
      <el-menu class="el-menu-vertical-demo" default-active="1" router>
        <el-menu-item index="1" route="/statistic">
          <el-icon>
            <data-analysis />
          </el-icon>
          <span>统计数据</span>
        </el-menu-item>
        <el-menu-item index="2" route="/article">
          <el-icon>
            <Document />
          </el-icon>
          <span>文章管理</span>
        </el-menu-item>
        <el-menu-item index="3" route="/daily">
          <el-icon> <house /> </el-icon>
          <span>日常管理</span>
        </el-menu-item>
        <el-menu-item index="4" route="/comment">
          <el-icon>
            <chat-dot-round />
          </el-icon>
          <span>评论管理</span>
        </el-menu-item>
        <el-menu-item index="5" route="/tag">
          <el-icon>
            <price-tag />
          </el-icon>
          <span>标签管理</span>
        </el-menu-item>
        <el-menu-item index="6" route="/category">
          <el-icon>
            <more />
          </el-icon>
          <span>分类管理</span>
        </el-menu-item>
        <el-menu-item index="7" route="/user">
          <el-icon>
            <user />
          </el-icon>
          <span>用户管理</span>
        </el-menu-item>
        <el-menu-item index="8" route="/friend">
          <el-icon>
            <link-icon />
          </el-icon>
          <span>友链管理</span>
        </el-menu-item>
        <el-menu-item index="9" route="/profile">
          <el-icon>
            <star />
          </el-icon>
          <span>关于自己</span>
        </el-menu-item>
        <el-menu-item index="10" route="/setting">
          <el-icon>
            <setting />
          </el-icon>
          <span>系统设置</span>
        </el-menu-item>
      </el-menu>
    </el-col>
    <el-col :span="20">
      <router-view />
    </el-col>
  </el-row>
</template>

<style scoped>
.flex-grow {
  flex-grow: 1;
}
</style>
