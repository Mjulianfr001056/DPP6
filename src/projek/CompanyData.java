package projek;

/**
 * Merupakan class yang berisi informasi lengkap terkait perusahaan yang berada di dalam:
 * 1. KIP             (Kode Provinsi, Kode Kabupaten, kode Kecamatan, Kode KJU, No. Urut dalam 1 Kab/Kota)
 * 2. Company         (Nama, Alamat, Bentuk Badan Hukum, Nomor Faximile, Nomor Telepon)
 * 3. CompanyResponse (Jenis Usaha Utama, Konfirmasi Keberadaan Perusahaan, Kondisi Perusahaan, 6 Subsektor Usaha)
 */
public record CompanyData(KIP kip, Company company, CompanyResponse companyResponse) {
    public static int nomor = 0;
    /**
     * Berisi lebih dari 1 data perusahaan
     * @param kip             berisi kode informasi perusahaan
     * @param company         berisi informasi umum terkait perusahaan
     * @param companyResponse berisi informasi jenis usaha utama, kondisi perusahaan, dan subsektor perusahaan
     */
    public CompanyData{
        nomor++;
    }
    
    /**
     * Method untuk menampilkan seluruh informasi terkait sebuah perusahaan
     * @return merupakan informasi yang berisi no. urut perusahaan yang diinput, KIP, Company, dan CompanyResponse
     */
    @Override
    public String toString() {
        return  "\u001B[94m######Perusahaan pertanian ke-\u001B[0m" + nomor +
                "\u001B[94m#####\u001B[0m" +
                "\u001B[94m\n#####KIP#####\n\u001B[0m" + kip.toString() +
                "\u001B[94m\n\n#####Informasi Perusahaan#####\n\u001B[0m" + company.toString() +
                "\n" + companyResponse.toString();
    }
}
