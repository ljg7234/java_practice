package practice;

public class ButtonExample {
    public static void main(String[] args) {
        Button btnOk = new Button();

        btnOk.setClickListener(new Button.ClickListener() {
            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다");
            }
        });

        btnOk.click();

        Button btnCancel = new Button();
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick(){
                System.out.println("cancel 버튼을 클릭했습니다");
            }
        }

        btnCancel.setClickListener(new CancelListener());
        btnCancel.click();
    }
}
