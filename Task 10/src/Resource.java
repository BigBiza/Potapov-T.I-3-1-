class Resource {
    private String resourceName;

    public Resource(String resourceName) {
        this.resourceName = resourceName;
    }

    public void displayResource() {
        System.out.println("Ресурс: " + resourceName);
    }
}
