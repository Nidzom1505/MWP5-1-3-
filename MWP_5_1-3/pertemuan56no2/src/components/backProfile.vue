<script>
export default {
    name: "TabKembali"
};
</script>

<template>
    <div class="tabKembali">
        <img id="back" src="/back-svgrepo-com.svg" alt="kembali">
        <section class="pas">
            <h2 id="namaKem">M.Nidzom Imtiyaz</h2>
            <p id="iyo">0 Postingan</p>
        </section>
    </div>
</template>

<style scoped>
.tabKembali {
    background: rgba(255, 255, 255, 0.2);
    backdrop-filter: blur(10px);
    width: 600px;
    height: 60px;
    display: flex;
    align-items: center;
    position: fixed;
    z-index: 11;
    left: 50%;
    transform: translateX(-50%);
    padding: 0 10px;
}

#back {
    width: 24px;
    height: 24px;
}

.pas {
    display: flex;
    flex-direction: column;
    margin-left: 30px;
    line-height: 0.5;
}

#namaKem {
    font-size: 16px;
    margin-bottom: 2px;
    color: aqua;
}

#iyo {
    font-size: 12px;
    color: grey;
    display: flex;
}
</style>