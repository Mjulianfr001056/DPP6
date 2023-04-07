package projek;

public record CompanyData(QuestionnaireHeader questionnaireHeader,
                          KIP kip, Company company, CompanyResponse companyResponse) {
    public static int nomor = 0;

    public CompanyData{
        nomor++;
    }

}
