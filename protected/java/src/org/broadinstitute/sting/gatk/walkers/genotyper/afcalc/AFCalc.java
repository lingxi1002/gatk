/*
*  By downloading the PROGRAM you agree to the following terms of use:
*  
*  BROAD INSTITUTE - SOFTWARE LICENSE AGREEMENT - FOR ACADEMIC NON-COMMERCIAL RESEARCH PURPOSES ONLY
*  
*  This Agreement is made between the Broad Institute, Inc. with a principal address at 7 Cambridge Center, Cambridge, MA 02142 (BROAD) and the LICENSEE and is effective at the date the downloading is completed (EFFECTIVE DATE).
*  
*  WHEREAS, LICENSEE desires to license the PROGRAM, as defined hereinafter, and BROAD wishes to have this PROGRAM utilized in the public interest, subject only to the royalty-free, nonexclusive, nontransferable license rights of the United States Government pursuant to 48 CFR 52.227-14; and
*  WHEREAS, LICENSEE desires to license the PROGRAM and BROAD desires to grant a license on the following terms and conditions.
*  NOW, THEREFORE, in consideration of the promises and covenants made herein, the parties hereto agree as follows:
*  
*  1. DEFINITIONS
*  1.1 PROGRAM shall mean copyright in the object code and source code known as GATK2 and related documentation, if any, as they exist on the EFFECTIVE DATE and can be downloaded from http://www.broadinstitute/GATK on the EFFECTIVE DATE.
*  
*  2. LICENSE
*  2.1   Grant. Subject to the terms of this Agreement, BROAD hereby grants to LICENSEE, solely for academic non-commercial research purposes, a non-exclusive, non-transferable license to: (a) download, execute and display the PROGRAM and (b) create bug fixes and modify the PROGRAM. 
*  The LICENSEE may apply the PROGRAM in a pipeline to data owned by users other than the LICENSEE and provide these users the results of the PROGRAM provided LICENSEE does so for academic non-commercial purposes only.  For clarification purposes, academic sponsored research is not a commercial use under the terms of this Agreement.
*  2.2  No Sublicensing or Additional Rights. LICENSEE shall not sublicense or distribute the PROGRAM, in whole or in part, without prior written permission from BROAD.  LICENSEE shall ensure that all of its users agree to the terms of this Agreement.  LICENSEE further agrees that it shall not put the PROGRAM on a network, server, or other similar technology that may be accessed by anyone other than the LICENSEE and its employees and users who have agreed to the terms of this agreement.
*  2.3  License Limitations. Nothing in this Agreement shall be construed to confer any rights upon LICENSEE by implication, estoppel, or otherwise to any computer software, trademark, intellectual property, or patent rights of BROAD, or of any other entity, except as expressly granted herein. LICENSEE agrees that the PROGRAM, in whole or part, shall not be used for any commercial purpose, including without limitation, as the basis of a commercial software or hardware product or to provide services. LICENSEE further agrees that the PROGRAM shall not be copied or otherwise adapted in order to circumvent the need for obtaining a license for use of the PROGRAM.  
*  
*  3. OWNERSHIP OF INTELLECTUAL PROPERTY 
*  LICENSEE acknowledges that title to the PROGRAM shall remain with BROAD. The PROGRAM is marked with the following BROAD copyright notice and notice of attribution to contributors. LICENSEE shall retain such notice on all copies.  LICENSEE agrees to include appropriate attribution if any results obtained from use of the PROGRAM are included in any publication.
*  Copyright 2012 Broad Institute, Inc.
*  Notice of attribution:  The GATK2 program was made available through the generosity of Medical and Population Genetics program at the Broad Institute, Inc.
*  LICENSEE shall not use any trademark or trade name of BROAD, or any variation, adaptation, or abbreviation, of such marks or trade names, or any names of officers, faculty, students, employees, or agents of BROAD except as states above for attribution purposes.
*  
*  4. INDEMNIFICATION
*  LICENSEE shall indemnify, defend, and hold harmless BROAD, and their respective officers, faculty, students, employees, associated investigators and agents, and their respective successors, heirs and assigns, (Indemnitees), against any liability, damage, loss, or expense (including reasonable attorneys fees and expenses) incurred by or imposed upon any of the Indemnitees in connection with any claims, suits, actions, demands or judgments arising out of any theory of liability (including, without limitation, actions in the form of tort, warranty, or strict liability and regardless of whether such action has any factual basis) pursuant to any right or license granted under this Agreement.
*  
*  5. NO REPRESENTATIONS OR WARRANTIES
*  THE PROGRAM IS DELIVERED AS IS.  BROAD MAKES NO REPRESENTATIONS OR WARRANTIES OF ANY KIND CONCERNING THE PROGRAM OR THE COPYRIGHT, EXPRESS OR IMPLIED, INCLUDING, WITHOUT LIMITATION, WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, NONINFRINGEMENT, OR THE ABSENCE OF LATENT OR OTHER DEFECTS, WHETHER OR NOT DISCOVERABLE. BROAD EXTENDS NO WARRANTIES OF ANY KIND AS TO PROGRAM CONFORMITY WITH WHATEVER USER MANUALS OR OTHER LITERATURE MAY BE ISSUED FROM TIME TO TIME.
*  IN NO EVENT SHALL BROAD OR ITS RESPECTIVE DIRECTORS, OFFICERS, EMPLOYEES, AFFILIATED INVESTIGATORS AND AFFILIATES BE LIABLE FOR INCIDENTAL OR CONSEQUENTIAL DAMAGES OF ANY KIND, INCLUDING, WITHOUT LIMITATION, ECONOMIC DAMAGES OR INJURY TO PROPERTY AND LOST PROFITS, REGARDLESS OF WHETHER BROAD SHALL BE ADVISED, SHALL HAVE OTHER REASON TO KNOW, OR IN FACT SHALL KNOW OF THE POSSIBILITY OF THE FOREGOING.
*  
*  6. ASSIGNMENT
*  This Agreement is personal to LICENSEE and any rights or obligations assigned by LICENSEE without the prior written consent of BROAD shall be null and void.
*  
*  7. MISCELLANEOUS
*  7.1 Export Control. LICENSEE gives assurance that it will comply with all United States export control laws and regulations controlling the export of the PROGRAM, including, without limitation, all Export Administration Regulations of the United States Department of Commerce. Among other things, these laws and regulations prohibit, or require a license for, the export of certain types of software to specified countries.
*  7.2 Termination. LICENSEE shall have the right to terminate this Agreement for any reason upon prior written notice to BROAD. If LICENSEE breaches any provision hereunder, and fails to cure such breach within thirty (30) days, BROAD may terminate this Agreement immediately. Upon termination, LICENSEE shall provide BROAD with written assurance that the original and all copies of the PROGRAM have been destroyed, except that, upon prior written authorization from BROAD, LICENSEE may retain a copy for archive purposes.
*  7.3 Survival. The following provisions shall survive the expiration or termination of this Agreement: Articles 1, 3, 4, 5 and Sections 2.2, 2.3, 7.3, and 7.4.
*  7.4 Notice. Any notices under this Agreement shall be in writing, shall specifically refer to this Agreement, and shall be sent by hand, recognized national overnight courier, confirmed facsimile transmission, confirmed electronic mail, or registered or certified mail, postage prepaid, return receipt requested.  All notices under this Agreement shall be deemed effective upon receipt. 
*  7.5 Amendment and Waiver; Entire Agreement. This Agreement may be amended, supplemented, or otherwise modified only by means of a written instrument signed by all parties. Any waiver of any rights or failure to act in a specific instance shall relate only to such instance and shall not be construed as an agreement to waive any rights or fail to act in any other instance, whether or not similar. This Agreement constitutes the entire agreement among the parties with respect to its subject matter and supersedes prior agreements or understandings between the parties relating to its subject matter. 
*  7.6 Binding Effect; Headings. This Agreement shall be binding upon and inure to the benefit of the parties and their respective permitted successors and assigns. All headings are for convenience only and shall not affect the meaning of any provision of this Agreement.
*  7.7 Governing Law. This Agreement shall be construed, governed, interpreted and applied in accordance with the internal laws of the Commonwealth of Massachusetts, U.S.A., without regard to conflict of laws principles.
*/

package org.broadinstitute.sting.gatk.walkers.genotyper.afcalc;

import com.google.java.contract.Ensures;
import com.google.java.contract.Requires;
import org.apache.log4j.Logger;
import org.broadinstitute.sting.utils.SimpleTimer;
import org.broadinstitute.variant.variantcontext.Allele;
import org.broadinstitute.variant.variantcontext.GenotypesContext;
import org.broadinstitute.variant.variantcontext.VariantContext;

import java.io.File;
import java.util.List;


/**
 * Generic interface for calculating the probability of alleles segregating given priors and genotype likelihoods
 */
public abstract class AFCalc implements Cloneable {
    private final static Logger defaultLogger = Logger.getLogger(AFCalc.class);

    protected final int nSamples;
    protected final int maxAlternateAllelesToGenotype;

    protected Logger logger = defaultLogger;

    private SimpleTimer callTimer = new SimpleTimer();
    private final StateTracker stateTracker;
    private ExactCallLogger exactCallLogger = null;

    /**
     * Create a new AFCalc object capable of calculating the prob. that alleles are
     * segregating among nSamples with up to maxAltAlleles for SNPs and maxAltAllelesForIndels
     * for indels for samples with ploidy
     *
     * @param nSamples number of samples, must be > 0
     * @param maxAltAlleles maxAltAlleles for SNPs
     * @param ploidy the ploidy, must be > 0
     */
    protected AFCalc(final int nSamples, final int maxAltAlleles, final int ploidy) {
        if ( nSamples < 0 ) throw new IllegalArgumentException("nSamples must be greater than zero " + nSamples);
        if ( maxAltAlleles < 1 ) throw new IllegalArgumentException("maxAltAlleles must be greater than zero " + maxAltAlleles);
        if ( ploidy < 1 ) throw new IllegalArgumentException("ploidy must be > 0 but got " + ploidy);

        this.nSamples = nSamples;
        this.maxAlternateAllelesToGenotype = maxAltAlleles;
        this.stateTracker = new StateTracker(maxAltAlleles);
    }

    /**
     * Enable exact call logging to file
     *
     * @param exactCallsLog the destination file
     */
    public void enableProcessLog(final File exactCallsLog) {
        exactCallLogger = new ExactCallLogger(exactCallsLog);
    }

    /**
     * Use this logger instead of the default logger
     *
     * @param logger
     */
    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    /**
     * Compute the probability of the alleles segregating given the genotype likelihoods of the samples in vc
     *
     * @param vc the VariantContext holding the alleles and sample information
     * @param log10AlleleFrequencyPriors a prior vector nSamples x 2 in length indicating the Pr(AF = i)
     * @return result (for programming convenience)
     */
    public AFCalcResult getLog10PNonRef(final VariantContext vc, final double[] log10AlleleFrequencyPriors) {
        if ( vc == null ) throw new IllegalArgumentException("VariantContext cannot be null");
        if ( log10AlleleFrequencyPriors == null ) throw new IllegalArgumentException("priors vector cannot be null");
        if ( stateTracker == null ) throw new IllegalArgumentException("Results object cannot be null");

        // reset the result, so we can store our new result there
        stateTracker.reset();

        final VariantContext vcWorking = reduceScope(vc);

        callTimer.start();
        final AFCalcResult result = computeLog10PNonRef(vcWorking, log10AlleleFrequencyPriors);
        final long nanoTime = callTimer.getElapsedTimeNano();

        if ( exactCallLogger != null )
            exactCallLogger.printCallInfo(vcWorking, log10AlleleFrequencyPriors, nanoTime, result);

        return result;
    }

    /**
     * Convert the final state of the state tracker into our result as an AFCalcResult
     *
     * Assumes that stateTracker has been updated accordingly
     *
     * @param vcWorking the VariantContext we actually used as input to the calc model (after reduction)
     * @param log10AlleleFrequencyPriors the priors by AC vector
     * @return a AFCalcResult describing the result of this calculation
     */
    @Requires("stateTracker.getnEvaluations() >= 0")
    @Ensures("result != null")
    protected AFCalcResult getResultFromFinalState(final VariantContext vcWorking, final double[] log10AlleleFrequencyPriors) {
        stateTracker.setAllelesUsedInGenotyping(vcWorking.getAlleles());
        return stateTracker.toAFCalcResult(log10AlleleFrequencyPriors);
    }

    // ---------------------------------------------------------------------------
    //
    // Abstract methods that should be implemented by concrete implementations
    // to actually calculate the AF
    //
    // ---------------------------------------------------------------------------

    /**
     * Look at VC and perhaps return a new one of reduced complexity, if that's necessary
     *
     * Used before the call to computeLog10PNonRef to simply the calculation job at hand,
     * if vc exceeds bounds.  For example, if VC has 100 alt alleles this function
     * may decide to only genotype the best 2 of them.
     *
     * @param vc the initial VC provided by the caller to this AFcalculation
     * @return a potentially simpler VC that's more tractable to genotype
     */
    @Requires("vc != null")
    @Ensures("result != null")
    protected abstract VariantContext reduceScope(final VariantContext vc);

    /**
     * Actually carry out the log10PNonRef calculation on vc, storing results in results
     *
     * @param vc                                variant context with alleles and genotype likelihoods
     * @param log10AlleleFrequencyPriors        priors
     * @return a AFCalcResult object describing the results of this calculation
     */
    @Requires({"vc != null", "log10AlleleFrequencyPriors != null"})
    protected abstract AFCalcResult computeLog10PNonRef(final VariantContext vc,
                                                        final double[] log10AlleleFrequencyPriors);

    /**
     * Subset VC to the just allelesToUse, updating genotype likelihoods
     *
     * Must be overridden by concrete subclasses
     *
     * @param vc                                variant context with alleles and genotype likelihoods
     * @param allelesToUse                      alleles to subset
     * @param assignGenotypes
     * @param ploidy
     * @return GenotypesContext object
     */
    public abstract GenotypesContext subsetAlleles(final VariantContext vc,
                                                   final List<Allele> allelesToUse,
                                                   final boolean assignGenotypes,
                                                   final int ploidy);

    // ---------------------------------------------------------------------------
    //
    // accessors
    //
    // ---------------------------------------------------------------------------

    public int getMaxAltAlleles() {
        return maxAlternateAllelesToGenotype;
    }

    protected StateTracker getStateTracker() {
        return stateTracker;
    }

}