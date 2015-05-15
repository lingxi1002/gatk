/*
* By downloading the PROGRAM you agree to the following terms of use:
* 
* BROAD INSTITUTE
* SOFTWARE LICENSE AGREEMENT
* FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
* 
* This Agreement is made between the Broad Institute, Inc. with a principal address at 415 Main Street, Cambridge, MA 02142 (“BROAD”) and the LICENSEE and is effective at the date the downloading is completed (“EFFECTIVE DATE”).
* 
* WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
* WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
* NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
* 
* 1. DEFINITIONS
* 1.1 PROGRAM shall mean copyright in the object code and source code known as GATK3 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute.org/gatk on the EFFECTIVE DATE.
* 
* 2. LICENSE
* 2.1 Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. LICENSEE hereby automatically grants to BROAD a non-exclusive, royalty-free, irrevocable license to any LICENSEE bug fixes or modifications to the PROGRAM with unlimited rights to sublicense and/or distribute.  LICENSEE agrees to provide any such modifications and bug fixes to BROAD promptly upon their creation.
* The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only. For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
* 2.2 No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD. LICENSEE shall ensure that all of its users agree to the terms of this Agreement. LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
* 2.3 License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.
* 
* 3. PHONE-HOME FEATURE
* LICENSEE expressly acknowledges that the PROGRAM contains an embedded automatic reporting system (“PHONE-HOME”) which is enabled by default upon download. Unless LICENSEE requests disablement of PHONE-HOME, LICENSEE agrees that BROAD may collect limited information transmitted by PHONE-HOME regarding LICENSEE and its use of the PROGRAM.  Such information shall include LICENSEE’S user identification, version number of the PROGRAM and tools being run, mode of analysis employed, and any error reports generated during run-time.  Collection of such information is used by BROAD solely to monitor usage rates, fulfill reporting requirements to BROAD funding agencies, drive improvements to the PROGRAM, and facilitate adjustments to PROGRAM-related documentation.
* 
* 4. OWNERSHIP OF INTELLECTUAL PROPERTY
* LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies. LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
* Copyright 2012-2014 Broad Institute, Inc.
* Notice of attribution: The GATK3 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
* LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
* 
* 5. INDEMNIFICATION
* LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
* 
* 6. NO REPRESENTATIONS OR WARRANTIES
* THE PROGRAM IS DELIVERED AS IS. BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
* IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
* 
* 7. ASSIGNMENT
* This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
* 
* 8. MISCELLANEOUS
* 8.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
* 8.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
* 8.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
* 8.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested. All notices under this Agreement shall be deemed effective upon receipt.
* 8.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter.
* 8.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
* 8.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.gatk.tools.walkers.na12878kb.core;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import org.broadinstitute.gatk.utils.commandline.Argument;
import org.broadinstitute.gatk.utils.exceptions.GATKException;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

/**
 * Standard arguments for interacting with the NA12878 DB
 *
 * User: depristo
 * Date: 11/15/12
 */
public class NA12878DBArgumentCollection {

    public static final String DEFAULT_SPEC_PATH = "resources/NA12878kb.json";
    public static final String LOCALHOST_SPEC_PATH = "resources/NA12878kb_local.json";

    @Argument(fullName = "useLocal", shortName = "useLocal", doc = "If true, the localhost MongoDB will be used; for testing only", required=false)
    protected boolean useLocal = false;

    /** Lazy loaded to work with GATK style argument value injection */
    String dbSpecPath = null;

    public MongoDBManager.Locator getLocator(){
        if ( dbSpecPath == null )
            dbSpecPath = getDBSpecPath(useLocal);

        final InputStream is = getInputStream(dbSpecPath);

        final BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String jsonString = "";
        String nextLine = null;
        try {
            while ((nextLine = reader.readLine()) != null) {
                jsonString += nextLine + "\n";
            }
            final MongoDBManager.Locator tmpLocator = (new Gson()).fromJson(jsonString, MongoDBManager.Locator.class);

            String dbName = tmpLocator.name;
            //Missing specVersion = v1
            if(tmpLocator.specVersion == null){
                dbName += dbToUse.getExtension();
            }
            return new MongoDBManager.Locator(tmpLocator.host, tmpLocator.port, dbName, tmpLocator.sitesCollection,
                    tmpLocator.callsetsCollection, tmpLocator.consensusCollection, tmpLocator.label, tmpLocator.specVersion);

        } catch (IOException e) {
            throw new RuntimeException("Failure while reading json file " + dbSpecPath, e);
        }catch (JsonParseException e){
            throw new RuntimeException("Failure parsing jsonString: " + e.getMessage() + "\n" + jsonString, e);
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException("Failed to close json reader for " + dbSpecPath, e);
            }
        }

    }

    /**
     * Retrieve an appropriate InputStream from the provided path
     *
     * Supports path to a resource contained in the jar, files
     * loaded over http, and files on local filesystem (tried in that order)
     * @param specPath path to db spec
     * @return InputStream
     * @throws GATKException
     */
    private InputStream getInputStream(final String specPath) throws GATKException{
        final InputStream is = getClass().getResourceAsStream(specPath);
        if(is != null) return is;

        if(specPath.toLowerCase().startsWith("http")){
            try {
                final URL url = new URL(specPath);
                final URLConnection conn = url.openConnection();
                if(conn instanceof HttpURLConnection){
                    ((HttpURLConnection) conn).setInstanceFollowRedirects(true);
                }
                return conn.getInputStream();
            } catch (MalformedURLException e) {
                throw new GATKException("Malformed url for db spec path", e);
            } catch (IOException e) {
                throw new GATKException("Error opening db spec", e);
            }

        }

        try {
            return new FileInputStream(specPath);
        } catch (FileNotFoundException e) {
            throw new GATKException("db spec path not found", e);
        }

    }

    public enum DBType {
        /** The production database, contains the stable data for analysis */
        PRODUCTION("_production"),
        /** A persistent development database, for playing with the KB itself */
        DEV("_development"),
        /** For unit and integration tests, not persistent */
        TEST("_test"),
        /** default one */
        DEFAULT("_NA"),

        BLANK("");

        private String extension;

        // Don't use the GATK fixed random seed -- we want to avoid namespace collisions between multiple GATK instances
        private static final Random rand = new Random();

        private DBType(String extension) {
            this.extension = extension;
        }

        public String getExtension() {
            // If using a test database, make an over-the-top effort to avoid naming collisions with
            // concurrently-running instances of the test suite
            return extension.equals("_test") ? String.format("%s_%d_%d", extension, System.currentTimeMillis(), rand.nextInt()) :
                                               extension;
        }
    }

    @Argument(fullName = "dbToUse", shortName = "dbToUse", doc = "Which database should we connect to?", required=false)
    public DBType dbToUse = DBType.DEFAULT;

    @Argument(shortName = "reset", required=false)
    public boolean resetDB = false;

    public NA12878DBArgumentCollection(){
        this(false);
    }

    private static String getDBSpecPath(boolean useLocal){
        return useLocal ? LOCALHOST_SPEC_PATH : DEFAULT_SPEC_PATH;
    }

    /**
     * Convenience constructor for choosing between local or remote
     * NA12878KB database
     * @param useLocal
     */
    public NA12878DBArgumentCollection(boolean useLocal){
        this.useLocal = useLocal;
    }

    /**
     *
     * This *forces* the dbToUse to be the production database
     *
     * @param dbSpecPath
     */
    public NA12878DBArgumentCollection(String dbSpecPath){
        this(dbSpecPath, DBType.PRODUCTION);
    }

    /**
     * @param dbSpecPath File describing host/name/port/etc.
     * Must be appropriate JSON format
     * @param dbToUse
     */
    public NA12878DBArgumentCollection(String dbSpecPath, DBType dbToUse){
        this.dbSpecPath = dbSpecPath;
        this.dbToUse = dbToUse;
    }
}