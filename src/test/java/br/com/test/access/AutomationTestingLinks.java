package br.com.test.access;

import br.com.test.constants.LinkConstants;

/**
 * Enumeration representing links to pages in an automation testing environment.
 */
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

    /**
     * Returns the link associated with the enum constant.
     *
     * @return the link to the page.
     */
    public abstract String getLink();
}
