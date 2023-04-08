package projek;

public record CompanyData(KIP kip, Company company, CompanyResponse companyResponse) {
    public static int nomor = 0;

    public CompanyData{
        nomor++;
    }

    @Override
    public String toString() {
        return  "\u001B[94m######Perusahaan pertanian ke-\u001B[0m" + nomor +
                "\u001B[94m#####\u001B[0m" +
                "\u001B[94m\n#####KIP#####\n\u001B[0m" + kip.toString() +
                "\u001B[94m\n\n#####Informasi Perusahaan#####\n\u001B[0m" + company.toString() +
                "\n" + companyResponse.toString();
    }
}
