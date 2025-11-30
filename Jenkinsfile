pipeline {
    pipeline {
        agent any

        // Pipeline parameters: a boolean to control whether tests run
        parameters {
            booleanParam(name: 'executeTests', defaultValue: true, description: 'Run tests?')
        }

        // Environment variables available to all stages
        environment {
            APP_VERSION = '1.2.3'
        }

        // Tools configured in Jenkins (names must match Global Tool Configuration)
        tools {
            maven 'Maven'
            jdk 'JDK11'
        }

        stages {
            stage('Build') {
                steps {
                    echo "Building version ${env.APP_VERSION}..."
                    // Use the configured Maven installation to show its version
                    script {
                        def mvnHome = tool 'Maven'
                        if (isUnix()) {
                            sh "${mvnHome}/bin/mvn -v"
                        } else {
                            bat "\"${mvnHome}\\bin\\mvn.cmd\" -v"
                        }
                    }
                }
            }

            stage('Test') {
                // Run this stage only if the boolean parameter is true
                when {
                    expression { return params.executeTests }
                }
                steps {
                    echo 'Testing...'
                }
            }

            stage('Deploy') {
                steps {
                    echo 'Deploying...'
                }
            }
        }

        post {
            always {
                echo 'Pipeline complete'
            }
        }
    }
