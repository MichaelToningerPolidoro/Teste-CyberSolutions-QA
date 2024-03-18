package br.com.test.access;

import br.com.test.constants.LinkConstants;

/**
 * TODO javadocs
 * */
public enum AutomationTestingLinks {

    REGISTER() {
        @Override
        public String getLink() {
            return LinkConstants.AUTOMATION_TESTING_BASE_URL + "/Register.html";
        }
    },

    FRAMES() {
        @Override
        public String getLink() {
            return LinkConstants.AUTOMATION_TESTING_BASE_URL + "/Frames.html";
        }
    },

    DATEPICKER() {
        @Override
        public String getLink() {
            return LinkConstants.AUTOMATION_TESTING_BASE_URL + "/Datepicker.html";
        }
    },

    SLIDER() {
        @Override
        public String getLink() {
            return LinkConstants.AUTOMATION_TESTING_BASE_URL + "/Slider.html";
        }
    }

    ;

    public abstract String getLink();
}
