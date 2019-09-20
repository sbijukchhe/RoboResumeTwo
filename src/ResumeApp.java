import java.util.Scanner;

public class ResumeApp {
    public static void main(String[] args){

        String response = "Y";

        Scanner input = new Scanner(System.in);

        Applicant applicant = new Applicant();
        Skill coreSkill = null;
        Education education = null;
        WorkExperience workExperience = null;

        System.out.println("Do you want to add applicant? Y / N");
        response = input.nextLine();

        while (response.equalsIgnoreCase("Y")) {
            if (response.equalsIgnoreCase("Y")) {

                // Request the name of applicant
                System.out.println("\nPlease enter your name ");
                 String name = input.nextLine();

                // Request the email of applicant
                System.out.println("Please enter your email address ");
                 String emailAdd = input.nextLine();

                // Request for Education details
                System.out.println("Do you want to enter your Education details? Y / N");
                response = input.nextLine();

                while (response.equalsIgnoreCase("Y")) {
                    if (response.equalsIgnoreCase("Y")) {

                        System.out.println("Please enter your Degree type - Associate's, Bachelor's, Master's, PhD");
                        String degreeType = input.nextLine();
                        System.out.println("Please enter your major ");
                        String major = input.nextLine();
                        System.out.println("Please enter your University / College name ");
                        String univName = input.nextLine();
                        System.out.println("Please enter your Graduation year ");
                        String gradYear = input.nextLine();

                        education = new Education();
                        Education educationOne = new Education(degreeType, major, univName, gradYear);
                        education.addEducation(educationOne);

                    }
                    System.out.println("Do you want to enter your Education details? Y / N");
                    response = input.nextLine();
                }

                // Request for Work experience
                System.out.println("Do you want to enter your Work Experience? Y / N");
                response = input.nextLine();

                while (response.equalsIgnoreCase("Y")) {
                    if (response.equalsIgnoreCase("Y")) {

                        System.out.println("Please enter your Job title ");
                        String jTitle = input.nextLine();
                        System.out.println("Please enter your Company name ");
                        String cName = input.nextLine();
                        System.out.println("Please enter your job Start date - month year (eg September 2019)");
                        String startDate = input.nextLine();
                        System.out.println("Please enter your job End date - month year (eg September 2019)");
                        String endDate = input.nextLine();
                        System.out.println("Please enter Job description ");
                        String jobDescription = input.nextLine();

                        workExperience = new WorkExperience();
                        WorkExperience myExperience = new WorkExperience(jTitle, cName, startDate, endDate, jobDescription);
                        workExperience.addExperience(myExperience);
                    }
                    System.out.println("Do you want to enter your Work Experience? Y / N");
                    response = input.nextLine();
                }

                //  // Request for Skill sets
                System.out.println("Do you want to enter your skills? Y / N");
                response = input.nextLine();

                while (response.equalsIgnoreCase("Y")) {
                    if (response.equalsIgnoreCase("Y")) {

                        System.out.println("Please enter your skill name");
                        String skillNameOne = input.nextLine();
                        System.out.println("Please enter your skill proficiency - Fundamental, Novice, Intermediate, " +
                                "Advanced or Expert");
                        String skillProfOne = input.nextLine();

                        coreSkill = new Skill();
                        Skill skillOne = new Skill(skillNameOne, skillProfOne);
                        coreSkill.addSkill(skillOne);
                    }
                    System.out.println("Do you want to enter your skills? Y / N");
                    response = input.nextLine();
                }

                // Add name, email, education, experience and skills to applicant object
                Applicant applicantOne = new Applicant(name, emailAdd, education, workExperience, coreSkill);
                applicant.addApplicant(applicantOne);
            }

            System.out.println("\nDo you want to add another applicant? Y / N");
            response = input.nextLine();

        }
        // Display all information about applicant
        applicant.displayApplicant();

    }
}

