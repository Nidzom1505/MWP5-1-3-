<template>
  <TabKembali />
  <Cover />
  <div class="container">
    <Bio />
  </div>
  <br><br>
  <nav id="nav">
    <router-link to="/">Postingan</router-link>
    <router-link to="/about">Balasan</router-link>
    <router-link to="/sorotan">Sorotan</router-link>
    <router-link to="/artikel">Artikel</router-link>
    <router-link to="/media">Media</router-link>
    <router-link to="/suka">Suka</router-link>
  </nav>
  <br>
  <router-view />
</template>

<script>
import TabKembali from "./components/backProfile.vue";
import Cover from "./components/coverPhoto.vue";
import Bio from "./components/bio.vue";


export default {
  components: {
    TabKembali,
    Cover,
    Bio,
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: black;
  text-decoration: none;
}

.container {
  display: flex;
  justify-content: center;
  margin-top: 10px;
}

#nav {
  width: 600px;
  transform: translateX(75%);
  display: flex;
  justify-content: center;
  padding: 5px;
  gap: 50px;
}

#nav a {
  text-decoration: none;
  color: grey;
}

#nav a.router-link-active {
    font-weight: bold;
    color:black;
    border-bottom: 5px solid #1d9bf0;
}
</style>
