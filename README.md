## Overview
Automation testing untuk website **SauceDemo** menggunakan:

- Java + Selenium WebDriver  
- TestNG  
- Page Object Model (POM)  

Fitur utama:  
- Modular dengan POM  
- Parallel test di 2 browser


Membuat skenario success checkout
Buka web https://www.saucedemo.com/
Login dengan 
Username : standard_user
Password : secret_sauce
Pilih produk Sauce Labs Backpack
Klik Add to Cart
Klik icon keranjang di kanan atas
Klik checkout
Isi form Your Information
Klik Continue
Klik Finish
Verify (Assert)  Thank you for your order! berhasil muncul 

## cara menjalankan test
./gradlew clean test  
