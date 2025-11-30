# SSD Lab12 — Jenkins CI/CD

This repository contains the `Jenkinsfile` used for Lab 12 (CI/CD pipeline) and a minimal Maven sample project so Jenkins can run build and tests.

Quick steps to run the lab locally

1. Start Jenkins (download `jenkins.war` from https://www.jenkins.io/download/ if needed):

```powershell
java -jar .\jenkins.war
```

2. Open Jenkins at `http://localhost:8080/`.

3. In Jenkins, install required plugins if missing: `Pipeline`, `Pipeline: Multibranch`, `Git plugin`, `GitHub Branch Source`, `Credentials`.

4. Add a GitHub credential (Personal Access Token) and create a new item:
- Name: `myfirstpipeline`
- Type: `Multibranch Pipeline`

5. Configure Branch Sources → GitHub (owner: `in5h`, repo: `ssd-lab12`) and save. Jenkins will scan for `Jenkinsfile`.

6. Verify a build runs for the `main` branch; open the build Console Output to see the pipeline messages.

Using the included Maven sample project

- `pom.xml` defines a tiny Java project with a single unit test. Jenkins `tools` block in the `Jenkinsfile` expects tools named `Maven` and `JDK11` in Jenkins → Global Tool Configuration.
- To run locally:

```powershell
cd path\to\ssd-lab12
mvn -v
mvn test
```

Screenshots: use the provided `lab12_screenshots.md` checklist to capture images for your lab PDF.
