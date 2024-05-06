package com.example.springDocumentation.bean;

public class MyBean1 {
    public static class MyInnerBean {
        private String message;

        public void setMessage(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public MyInnerBean innerBean;

    public MyInnerBean getInnerBean() {
        return this.innerBean;
    }

    public void setInnerBean(MyInnerBean innerBean) {
        this.innerBean = innerBean;
    }

}
