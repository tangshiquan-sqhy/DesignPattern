package com.tsq.dp.template;

public class TemplateTest {
    public static void main(String[] args) {
        AbstractBase r = new Register();
        r.submitForm();

        System.out.println("==============");
        AbstractBase a = new Audit();
        a.submitForm();
    }
}
