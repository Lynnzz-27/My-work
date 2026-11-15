function SegiEmpat() {
    
}

SegiEmpat.prototype.panjang = 0;
SegiEmpat.prototype.lebar = 0;

SegiEmpat.prototype.HitungLuas = function() {
    var luas = this.panjang * this.lebar;
    return luas;
}

SegiEmpat.prototype.hitungKeliling = function() {
    var kel = 2 * (this.panjang + this.lebar);
    return kel;
}

var s = new SegiEmpat();
s.panjang = 4;
s.lebar = 3;
document.write(s.HitungLuas);
document.write("<br>");
document.write(s.hitungKeliling);