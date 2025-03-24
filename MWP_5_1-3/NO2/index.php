<?php
$ig = "https://www.instagram.com/mni_15/";
$github = "https://github.com/Nidzom1505";
$linkIn = "https://www.linkedin.com/in/nidzooom15";
$yt = "https://www.youtube.com/@Nidzzz1555";

date_default_timezone_set("Asia/Jakarta");
$tanggal = date("d F Y");
$jam = date("H:i:s");
?>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="style.css">
</head>

<body>
    <header id="header">
        <h3 class="head-tanggal"><?= $tanggal; ?></h3>
        <h3 class="head-jam"><?= $jam ?></h3>
    </header>

    <main id="main">
        <div class="main-text">
            <h1>Muhammad Nidzom Imtiyaz</h1>
            <p>"Hai! Saya Nidzom, mahasiswa sistem informasi
                UIN Sunan Ampel Surabaya. Saya percaya bahwa hubungan yang baik membuka pintu untuk kesempatan besar."
            </p>
        </div>

        <img src="assets/photo.png" alt="photo">
    </main>

    <footer>
        <div class="footer-container">
            <div class="footer-img">
                <ul>
                    <li>
                        <a href="<?= $ig; ?>"><img src="assets/instagram.svg" alt="Instagram"></a>
                    </li>
                    <li>
                        <a href="<?= $github; ?>"><img src="assets/github.svg" alt="GitHub"></a>
                    </li>
                    <li>
                        <a href="<?= $linkIn; ?>"><img src="assets/linkedin.svg" alt="LinkedIn"></a>
                    </li>
                    <li>
                        <a href="<?= $yt; ?>"><img src="assets/youtube.svg" alt="YouTube"></a>
                    </li>
                </ul>
            </div>

            <div class="footer-form">
                <p>Kenal lebih lanjut atau kritik dan saran pada saya...</p>
                <form onsubmit="kirim()">
                    <label for="name">Nama:</label>
                    <input type="text" id="name" name="name" placeholder="Masukkan nama Anda" required>

                    <label for="message">Pesan:</label>
                    <textarea id="message" name="message" rows="4" placeholder="Tulis pesan Anda..."
                        required></textarea>

                    <button type="submit">Kirim</button>
                </form>
            </div>
        </div>
    </footer>

    <script>
        function kirim() {
            alert("Logikanya akan langsung kirim ke whatsapp/email");
        }
    </script>
</body>

</html>