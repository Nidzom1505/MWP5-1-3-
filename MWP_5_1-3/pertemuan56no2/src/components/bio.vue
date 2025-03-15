<script>
import Swal from "sweetalert2";

export default {
    name: "bio",
    methods: {
        tampilkanError() {
            Swal.fire({
                title: "Terjadi Kesalahan!",
                text: "Ini adalah tiruan.",
                icon: "error",
                confirmButtonColor: "#d33",
                confirmButtonText: "OK"
            });
        }
    }
};
</script>

<template>
    <div class="bio">
        <div class="namaVeri">
            <h2 id="namaBio">M.Nidzom Imtiyaz</h2>
            <button class="verified" @click="tampilkanError">
                <img src="/verified-svgrepo-com (2).svg" alt="ok" id="veri">
                <h4>Dapatkan verifikasi</h4>
            </button>
        </div>

        <h5 id="userBio">@NidzomImtiyaz</h5>

        <div class="infoBio">
            <section class="lokasi">
                <img src="/location-pin-alt-1-svgrepo-com.svg" alt="loc" id="location">
                <p>Jawa Timur, Indonesia</p>
            </section>

            <section class="lokasi">
                <img src="/calender.svg" alt="cal" id="location">
                <p>Bergabung, April 2023</p>
            </section>
        </div>

        <div class="okee">
            <section class="oke">
                <h6 id="angka">1,5k</h6>
                <p>Mengikuti</p>
            </section>

            <section class="oke">
                <h6 id="angka">6k</h6>
                <p>Pengikut</p>
            </section>
        </div>
    </div>
</template>

<style scoped>
.bio {
    width: 600px;
}

#namaBio {
    font-size: 18px;
}

#veri {
    width: 15px;
    height: 15px;
}

.namaVeri {
    display: flex;
    align-items: center;
    margin-left: 15px;
    height: 20px;
}

.verified {
    border-radius: 30px;
    border: 1px solid rgb(187, 187, 187);
    margin-left: 10px;
    display: flex;
    justify-content: center;
    align-items: center;
    width: 190px;
    height: 20px;
    background-color: transparent;
}

.verified:hover {
    background-color: gainsboro;
    color: black;
}

#userBio {
    color: gray;
    margin-top: 3px;
    font-style: normal;
    font-size: 15px;
    display: flex;
    margin-left: 15px;
}

#location {
    width: 20px;
    height: 20px;
}

.lokasi {
    display: flex;
    align-items: center;
    gap: 5px;
}

.infoBio {
    display: flex;
    align-items: center;
    margin-left: 15px;
    height: 30px;
    gap: 15px;
}

.oke {
    display: flex;
    align-items: center;
    gap: 5px;
}

.okee {
    gap: 15px;
    display: flex;
    align-items: center;
    margin-left: 15px;
    height: 30px;
}

#angka {
    font-size: 15px;
}
</style>