public class Sampleinterface {

    interface DevOpsTool {
        void configure();
        void deploy();
    }

    public class Samplecodeinterface implements DevOpsTool {

        @Override
        public void configure() {
            System.out.println("Configuring the DevOps tool...");
        }

        @Override
        public void deploy() {
            System.out.println("Deploying the application...");
        }

        public static void main(String[] args) {
            Sampleinterface tool = new Sampleinterface();
            tool.configure();
            tool.deploy();
        }
    }

    private void deploy() {
        System.out.println("hii");
    }

    private void configure() {
        System.out.println("hello...");
    }

}
