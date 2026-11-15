document.addEventListener('DOMContentLoaded', () => {
    const hamburgerBtn = document.getElementById('hamburger-btn');
    const closeSidebarBtn = document.getElementById('close-sidebar');
    const sidebar = document.getElementById('sidebar');
    const orderForm = document.getElementById('orderForm');

    hamburgerBtn.onclick = () => sidebar.classList.add('active');
    closeSidebarBtn.onclick = () => sidebar.classList.remove('active');

    if(orderForm) {
        orderForm.onsubmit = (e) => {
            e.preventDefault();
            const orderData = {
                name: document.getElementById('custName').value,
                service: document.getElementById('serviceType').value,
                date: new Date().toLocaleDateString('id-ID')
            };
            localStorage.setItem('lastOrder', JSON.stringify(orderData));
            alert('Pesanan Terkirim!');
            loadOrderData();
            showSection('order-details');
        };
    }
    loadOrderData();
});

function showSection(sectionId) {
    document.querySelectorAll('.section').forEach(s => s.classList.remove('active'));
    document.getElementById(sectionId).classList.add('active');
    document.getElementById('sidebar').classList.remove('active');
    window.scrollTo(0,0);
}

function loadOrderData() {
    const savedData = localStorage.getItem('lastOrder');
    if (savedData) {
        const data = JSON.parse(savedData);
        document.getElementById('viewName').innerText = data.name;
        document.getElementById('viewService').innerText = data.service;
        document.getElementById('viewDate').innerText = data.date;
        document.getElementById('noDataMsg').style.display = 'none';
    } else {
        document.getElementById('noDataMsg').style.display = 'block';
    }
}document.addEventListener('DOMContentLoaded', () => {
    const hamburgerBtn = document.getElementById('hamburger-btn');
    const closeSidebarBtn = document.getElementById('close-sidebar');
    const sidebar = document.getElementById('sidebar');
    const orderForm = document.getElementById('orderForm');

    hamburgerBtn.onclick = () => sidebar.classList.add('active');
    closeSidebarBtn.onclick = () => sidebar.classList.remove('active');

    if(orderForm) {
        orderForm.onsubmit = (e) => {
            e.preventDefault();
            const orderData = {
                name: document.getElementById('custName').value,
                service: document.getElementById('serviceType').value,
                date: new Date().toLocaleDateString('id-ID')
            };
            localStorage.setItem('lastOrder', JSON.stringify(orderData));
            alert('Pesanan Terkirim!');
            loadOrderData();
            showSection('order-details');
        };
    }
    loadOrderData();
});

function showSection(sectionId) {
    document.querySelectorAll('.section').forEach(s => s.classList.remove('active'));
    document.getElementById(sectionId).classList.add('active');
    document.getElementById('sidebar').classList.remove('active');
    window.scrollTo(0,0);
}

// Tambahkan fungsi ini di dalam script.js kamu

function deleteOrder() {
    // Konfirmasi ke user sebelum menghapus
    const yakin = confirm("Apakah Anda yakin ingin menghapus data pelanggan ini?");
    
    if (yakin) {
        // 1. Hapus data dari localStorage
        localStorage.removeItem('lastOrder');
        
        // 2. Beri notifikasi
        alert("Data pelanggan berhasil dihapus!");
        
        // 3. Refresh tampilan data
        loadOrderData();
    }
}

// Perbarui juga fungsi loadOrderData agar tombol hapus hilang jika data kosong
function loadOrderData() {
    const savedData = localStorage.getItem('lastOrder');
    const table = document.getElementById('orderTable');
    const actionButtons = document.getElementById('actionButtons');
    const noDataMsg = document.getElementById('noDataMsg');

    if (savedData) {
        const data = JSON.parse(savedData);
        document.getElementById('viewName').innerText = data.name;
        document.getElementById('viewService').innerText = data.service;
        document.getElementById('viewDate').innerText = data.date;
        
        // Tampilkan tabel & tombol, sembunyikan pesan kosong
        table.style.display = 'table';
        actionButtons.style.display = 'block';
        noDataMsg.style.display = 'none';
    } else {
        // Sembunyikan tabel & tombol, tampilkan pesan kosong
        table.style.display = 'none';
        actionButtons.style.display = 'none';
        noDataMsg.style.display = 'block';
    }
}

