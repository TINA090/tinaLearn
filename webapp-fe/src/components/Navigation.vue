<template>
    <el-menu default-active="/user" :router="true">
      <el-submenu>
        <template slot="title">User Profile</template>
          <el-menu-item index="/user">User List</el-menu-item>
          <el-menu-item index="1-2">选项2</el-menu-item>
      </el-submenu>
      <el-submenu index="/other">
        <template slot="title">Other</template>
        <el-menu-item index="/grid">Grid</el-menu-item>
        <el-menu-item index="/character">Character</el-menu-item>
        <el-menu-item index="/table">Bloods</el-menu-item>
      </el-submenu>

    </el-menu>
</template>
<script>
export default {
  username: 'navigation',
  data () {
    return {
    }
  }
}
</script>
