<template>
  <div id="app">
    <home-page></home-page>
  </div>
</template>

<script>
import HomePage from "@/components/Home/HomePage";

export default {
  name: 'App',
  components: {
    HomePage
  }
}
</script>

<style>
@import "assets/css/normaliz.css";
@import "assets/css/base.css";

  #app{
    width: 100%;
    height: 100%;
    min-width: 310px;
  }
</style>
