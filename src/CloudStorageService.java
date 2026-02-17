public class CloudStorageService extends Service
        implements PremiumFeature, Billable {

    private boolean isPremium;

    public CloudStorageService(String name, int id) {
        super(name, id);
        isPremium = false;
    }

    @Override
    public void performService() {

        if (!isActive) {
            System.out.println("Cloud Storage не активен");
        }
        System.out.println("Получен доступ к Cloud Storage");
    }

    @Override
    public void upgradeToPremium() {
        isPremium = true;
        System.out.println("Cloud Storage Service обновлен до Premium!");
    }

    @Override
    public void generateBill() {
        System.out.println("Цена за использование Cloud Storage 100$");
    }
}