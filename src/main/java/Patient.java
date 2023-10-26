class Patient implements Runnable {
    private String name;
    private PatientService patientService;

    public Patient(String name, PatientService patientService) {
        this.name = name;
        this.patientService = patientService;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        patientService.goToTherapy(name);
    }
}
