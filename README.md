<h1 align="center">Cyber Solutions's QA Test</h1>

This test have been made to a job opportunity in Cyber Solutions.
It is a refactored version where I rearranged all classes to improve the architecture, rewrite xpath and added some features in project

## Technologies 🤖

- java 17
- Selenium 4
- Cucumber 7
- AssertJ

## What's in the project 🤔

- Parallel execution
- Browser, headless and thread count configurable via environment variables
- Some javadocs
- Dynamic xpath

## What I practiced 🏋️

- English
- Architecting
- Parallel execution tests
- Xpath handling

## What about scenarios 🥒📝

- 1º Fill fields into register page
- 2º Write a text inside a IFrame
- 3º Select dates into disabled and enabled datepicker, only using buttons
- 4º Set slide to a specific value

## How to configure ⚙️

The project needs java JDK 17 and some environment variable to be set:

- `browser`: set witch browser will be used. Possible values: chrome and edge.
- `headless`: if execution will be headless or not. Possible values: true and false.
- `parallel_scenarios_count`: how many tests will run in parallel. Possible values: Any integer > 0

## Running project ▶️

You can run this project using `RunnerTest.java` class. To change witch scenario will run, set the `FILTER_TAGS_PROPERTY_NAME`
containing with tag you want. For runner, is necessary to use '@' before tag name.

Maven executions is possible too:

- run `mvn install -Dgroups="regression"` to run every scenario
- to set many scenarios and make regex to find scenarios inside features, [check this junit 5 guide](https://junit.org/junit5/docs/snapshot/user-guide/#running-tests-tag-expressions).
Using maven with junit 5 to run tests, don't need to put '@' before tags, only it's name.

Thank you so much for reading this! 🙏
