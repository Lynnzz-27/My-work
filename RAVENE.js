document.addEventListener('DOMContentLoaded', () => {

    // Fungsionalitas Search Bar
    const searchForm = document.getElementById('search-form');
    const searchInput = document.getElementById('search-input');

    searchForm.addEventListener('submit', (e) => {
        e.preventDefault(); // Mencegah halaman reload
        const query = searchInput.value;
        if (query) {
            alert('Anda mencari: ' + query);
            // Di sini Anda bisa ganti 'alert' dengan logika pencarian sungguhan
            // misalnya: window.location.href = '/search?q=' + query;
        }
    });

    // Fungsionalitas Navbar
    const navLinks = document.querySelectorAll('.navbar a');
    navLinks.forEach(link => {
        link.addEventListener('click', (e) => {
            e.preventDefault(); // Mencegah pindah halaman (karena href="#")
            const pageName = link.textContent;
            alert('Anda mengklik: ' + pageName);
            // Ganti 'alert' ini dengan tautan sungguhan
            // contoh: if (pageName === 'COLLECTION') {
            //     window.location.href = '/collection.html';
            // }
        });
    });
});