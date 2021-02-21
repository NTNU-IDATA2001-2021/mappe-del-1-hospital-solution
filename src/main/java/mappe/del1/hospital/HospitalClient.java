package mappe.del1.hospital;

public final class HospitalClient {

    private HospitalClient() {
        // not called
    }

    public static void main(final String[] args) {
        Hospital hospital = new Hospital("St. Olavs Hospital");

        HospitalTestData.fillRegisterWithTestData(hospital);

        System.out.println(hospital.toString());
    }
}
