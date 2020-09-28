<template>
  <div id="app">
<!--    <home-page v-show="true"></home-page>-->
<!--    <request-deny v-show="false"></request-deny>-->
    <keep-alive>
      <router-view></router-view>
    </keep-alive>
    <loading v-if="$store.state._needLoading_"></loading>
  </div>
</template>

<script>
import Loading from "@/components/commons/Loading";

export default {
  name: 'App',
  components: {
    Loading
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
