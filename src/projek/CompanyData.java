package projek;

public record CompanyData(KIP kip, Company company, CompanyResponse companyResponse) {
    public static int nomor = 0;

    public CompanyData{
        nomor++;
    }

}
