package projek;

public record CompanyData(KIP kip, Company company, CompanyResponse companyResponse) {
    public static int nomor = 0;

    public CompanyData{
        nomor++;
    }

    @Override
    public String toString() {
        return  "######Perusahaan pertanian ke-" + nomor + "#####" +
                "\n#####KIP#####\n" + kip.toString() +
                "\n\n#####Informasi Perusahaan#####\n" + company.toString() +
                "\n" + companyResponse.toString();
    }
}
