<script>
export default {
    name: "cover",
    methods: {
    cobaTombol() {
        alert("ini mencobanya");
    }
}
};
</script>

<template>
    <div id="por">
        <img src="/background.jpg" alt="gambar" id="backgroundProf">
        <section class="profilAtur">
            <img src="/default_profile_400x400.png" alt="profile" id="profile1">
            <button id="atur" @click="cobaTombol">Atur profil</button>
        </section>
    </div>
</template>

<style scoped>
#por {
    height: 330px;
}

#backgroundProf {
    width: 600px;
    height: 199px;
    margin-top: 60px;
}

#profile1 {
    width: 135px;
    height: 135px;
    border-radius: 50%;
    border: 4px solid white;
    position: relative;
    top: -80px;
    left: 15px;
    z-index: 10;
}

.profilAtur {
    display: flex;
    justify-content: center;
}

#atur {
    width: 90px;
    height: 30px;
    margin-left: 333px;
    margin-top: 10px;
    border-radius: 50px;
    font-size: 16px;
    border: 1px solid gainsboro;
    background-color: transparent;
    color: black;
    cursor: pointer;
    transition: all 0.3s ease;
}

#atur:hover {
    background-color: gainsboro;
    color: black;
}
</style>