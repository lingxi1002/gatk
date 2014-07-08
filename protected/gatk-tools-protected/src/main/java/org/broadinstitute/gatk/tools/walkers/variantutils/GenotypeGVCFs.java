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

package org.broadinstitute.gatk.tools.walkers.variantutils;

import org.broadinstitute.gatk.engine.arguments.GenotypeCalculationArgumentCollection;
import org.broadinstitute.gatk.tools.walkers.genotyper.GenotypingEngine;
import org.broadinstitute.gatk.utils.commandline.*;
import org.broadinstitute.gatk.engine.CommandLineGATK;
import org.broadinstitute.gatk.engine.arguments.DbsnpArgumentCollection;
import org.broadinstitute.gatk.engine.contexts.AlignmentContext;
import org.broadinstitute.gatk.engine.contexts.ReferenceContext;
import org.broadinstitute.gatk.engine.refdata.RefMetaDataTracker;
import org.broadinstitute.gatk.engine.walkers.Reference;
import org.broadinstitute.gatk.engine.walkers.RodWalker;
import org.broadinstitute.gatk.engine.walkers.TreeReducible;
import org.broadinstitute.gatk.engine.walkers.Window;
import org.broadinstitute.gatk.tools.walkers.annotator.VariantAnnotatorEngine;
import org.broadinstitute.gatk.tools.walkers.annotator.interfaces.AnnotatorCompatible;
import org.broadinstitute.gatk.tools.walkers.genotyper.UnifiedArgumentCollection;
import org.broadinstitute.gatk.tools.walkers.genotyper.UnifiedGenotypingEngine;
import org.broadinstitute.gatk.utils.GenomeLoc;
import org.broadinstitute.gatk.utils.SampleUtils;
import org.broadinstitute.gatk.utils.help.DocumentedGATKFeature;
import org.broadinstitute.gatk.utils.help.HelpConstants;
import org.broadinstitute.gatk.utils.variant.GATKVCFUtils;
import org.broadinstitute.gatk.utils.variant.GATKVariantContextUtils;
import htsjdk.variant.variantcontext.*;
import htsjdk.variant.variantcontext.writer.VariantContextWriter;
import htsjdk.variant.vcf.*;

import java.util.*;

/**
 * Genotypes any number of gVCF files that were produced by the Haplotype Caller into a single joint VCF file.
 *
 * <p>
 * GenotypeGVCFs merges gVCF records that were produced as part of the reference model-based variant discovery pipeline (see documentation for more details) using
 * the '-ERC GVCF' or '-ERC BP_RESOLUTION' mode of the HaplotypeCaller.  This tool performs the multi-sample joint aggregation
 * step and merges the records together in a sophisticated manner.
 *
 * At all positions of the target, this tool will combine all spanning records, produce correct genotype likelihoods,
 * re-genotype the newly merged record, and then re-annotate it.
 *
 * Note that this tool cannot work with just any gVCF files - they must have been produced with the HaplotypeCaller,
 * which uses a sophisticated reference model to produce accurate genotype likelihoods for every position in the target.
 *
 * <h3>Input</h3>
 * <p>
 * One or more Haplotype Caller gVCFs to genotype.
 * </p>
 *
 * <h3>Output</h3>
 * <p>
 * A combined, genotyped VCF.
 * </p>
 *
 * <h3>Examples</h3>
 * <pre>
 * java -Xmx2g -jar GenomeAnalysisTK.jar \
 *   -R ref.fasta \
 *   -T GenotypeGVCFs \
 *   --variant gvcf1.vcf \
 *   --variant gvcf2.vcf \
 *   -o output.vcf
 * </pre>
 *
 */
@DocumentedGATKFeature( groupName = HelpConstants.DOCS_CAT_VARDISC, extraDocs = {CommandLineGATK.class} )
@Reference(window=@Window(start=-10,stop=10))
public class GenotypeGVCFs extends RodWalker<VariantContext, VariantContextWriter> implements AnnotatorCompatible, TreeReducible<VariantContextWriter> {

    /**
     * The gVCF files to merge together
     */
    @Input(fullName="variant", shortName = "V", doc="One or more input gVCF files", required=true)
    public List<RodBindingCollection<VariantContext>> variantCollections;
    final private List<RodBinding<VariantContext>> variants = new ArrayList<>();

    @Output(doc="File to which variants should be written")
    protected VariantContextWriter vcfWriter = null;

    @Argument(fullName="includeNonVariantSites", shortName="allSites", doc="Include loci found to be non-variant after genotyping", required=false)
    public boolean INCLUDE_NON_VARIANTS = false;

    @ArgumentCollection
    public GenotypeCalculationArgumentCollection genotypeArgs = new GenotypeCalculationArgumentCollection();

    /**
     * Which annotations to recompute for the combined output VCF file.
     */
    @Advanced
    @Argument(fullName="annotation", shortName="A", doc="One or more specific annotations to recompute.  The single value 'none' removes the default annotations", required=false)
    protected List<String> annotationsToUse = new ArrayList<>(Arrays.asList(new String[]{"InbreedingCoeff", "FisherStrand", "QualByDepth", "ChromosomeCounts", "GenotypeSummaries"}));

    /**
     * The rsIDs from this file are used to populate the ID column of the output.  Also, the DB INFO flag will be set when appropriate. Note that dbSNP is not used in any way for the calculations themselves.
     */
    @ArgumentCollection
    protected DbsnpArgumentCollection dbsnp = new DbsnpArgumentCollection();
    public RodBinding<VariantContext> getDbsnpRodBinding() { return dbsnp.dbsnp; }

    // the genotyping engine
    private UnifiedGenotypingEngine genotypingEngine;
    // the annotation engine
    private VariantAnnotatorEngine annotationEngine;

    public List<RodBinding<VariantContext>> getCompRodBindings() { return Collections.emptyList(); }
    public RodBinding<VariantContext> getSnpEffRodBinding() { return null; }
    public List<RodBinding<VariantContext>> getResourceRodBindings() { return Collections.emptyList(); }
    public boolean alwaysAppendDbsnpId() { return false; }


    public void initialize() {
        // collect the actual rod bindings into a list for use later
        for ( final RodBindingCollection<VariantContext> variantCollection : variantCollections )
            variants.addAll(variantCollection.getRodBindings());

        final Map<String, VCFHeader> vcfRods = GATKVCFUtils.getVCFHeadersFromRods(getToolkit(), variants);
        final Set<String> samples = SampleUtils.getSampleList(vcfRods, GATKVariantContextUtils.GenotypeMergeType.REQUIRE_UNIQUE);
        // create the genotyping engine
        genotypingEngine = new UnifiedGenotypingEngine(getToolkit(), createUAC(), samples);
        // create the annotation engine
        annotationEngine = new VariantAnnotatorEngine(Arrays.asList("none"), annotationsToUse, Collections.<String>emptyList(), this, getToolkit());

        // take care of the VCF headers
        final Set<VCFHeaderLine> headerLines = VCFUtils.smartMergeHeaders(vcfRods.values(), true);
        headerLines.addAll(annotationEngine.getVCFAnnotationDescriptions());
        headerLines.addAll(genotypingEngine.getAppropriateVCFInfoHeaders());
        // add the pool values for each genotype
        if (genotypeArgs.samplePloidy != GATKVariantContextUtils.DEFAULT_PLOIDY) {
            headerLines.add(new VCFFormatHeaderLine(VCFConstants.MLE_PER_SAMPLE_ALLELE_COUNT_KEY, VCFHeaderLineCount.A, VCFHeaderLineType.Integer, "Maximum likelihood expectation (MLE) for the alternate allele count, in the same order as listed, for each individual sample"));
            headerLines.add(new VCFFormatHeaderLine(VCFConstants.MLE_PER_SAMPLE_ALLELE_FRACTION_KEY, VCFHeaderLineCount.A, VCFHeaderLineType.Float, "Maximum likelihood expectation (MLE) for the alternate allele fraction, in the same order as listed, for each individual sample"));
        }
        VCFStandardHeaderLines.addStandardInfoLines(headerLines, true, VCFConstants.MLE_ALLELE_COUNT_KEY, VCFConstants.MLE_ALLELE_FREQUENCY_KEY);
        if ( dbsnp != null && dbsnp.dbsnp.isBound() )
            VCFStandardHeaderLines.addStandardInfoLines(headerLines, true, VCFConstants.DBSNP_KEY);

        final VCFHeader vcfHeader = new VCFHeader(headerLines, samples);
        vcfWriter.writeHeader(vcfHeader);
    }

    public VariantContext map(final RefMetaDataTracker tracker, final ReferenceContext ref, final AlignmentContext context) {
        if ( tracker == null ) // RodWalkers can make funky map calls
            return null;

        final GenomeLoc loc = ref.getLocus();
        final VariantContext combinedVC = GATKVariantContextUtils.referenceConfidenceMerge(tracker.getPrioritizedValue(variants, loc), loc, INCLUDE_NON_VARIANTS ? ref.getBase() : null, true);
        if ( combinedVC == null )
            return null;

        return regenotypeVC(tracker, ref, combinedVC);
    }

    /**
     * Re-genotype (and re-annotate) a combined genomic VC
     *
     * @param tracker        the ref tracker
     * @param ref            the ref context
     * @param originalVC     the combined genomic VC
     * @return a new VariantContext or null if the site turned monomorphic and we don't want such sites
     */
    protected VariantContext regenotypeVC(final RefMetaDataTracker tracker, final ReferenceContext ref, final VariantContext originalVC) {
        if ( originalVC == null ) throw new IllegalArgumentException("originalVC cannot be null");

        VariantContext result = originalVC;

        // only re-genotype polymorphic sites
        if ( result.isVariant() ) {
            VariantContext regenotypedVC = genotypingEngine.calculateGenotypes(result);
            if ( regenotypedVC == null )
                return null;

            regenotypedVC = GATKVariantContextUtils.reverseTrimAlleles(regenotypedVC);

            // we want to carry forward the attributes from the original VC but make sure to add the MLE-based annotations
            final Map<String, Object> attrs = new HashMap<>(originalVC.getAttributes());
            attrs.put(VCFConstants.MLE_ALLELE_COUNT_KEY, regenotypedVC.getAttribute(VCFConstants.MLE_ALLELE_COUNT_KEY));
            attrs.put(VCFConstants.MLE_ALLELE_FREQUENCY_KEY, regenotypedVC.getAttribute(VCFConstants.MLE_ALLELE_FREQUENCY_KEY));
            if (regenotypedVC.hasAttribute(GenotypingEngine.NUMBER_OF_DISCOVERED_ALLELES_KEY))
                attrs.put(GenotypingEngine.NUMBER_OF_DISCOVERED_ALLELES_KEY, regenotypedVC.getAttribute(GenotypingEngine.NUMBER_OF_DISCOVERED_ALLELES_KEY));

            result = new VariantContextBuilder(regenotypedVC).attributes(attrs).make();
        }

        // if it turned monomorphic then we either need to ignore or fix such sites
        boolean createRefGTs = false;
        if ( result.isMonomorphicInSamples() ) {
            if ( !INCLUDE_NON_VARIANTS )
                return null;
            createRefGTs = true;
        }

        // re-annotate it
        result = annotationEngine.annotateContext(tracker, ref, null, result);

        // fix some of the annotations
        return new VariantContextBuilder(result).genotypes(cleanupGenotypeAnnotations(result, createRefGTs)).make();
    }

    /**
     * Cleans up genotype-level annotations that need to be updated.
     * 1. move MIN_DP to DP if present
     * 2. propagate DP to AD if not present
     * 3. remove SB if present
     *
     * @param VC            the VariantContext with the Genotypes to fix
     * @param createRefGTs  if true we will also create proper hom ref genotypes since we assume the site is monomorphic
     * @return a new set of Genotypes
     */
    private List<Genotype> cleanupGenotypeAnnotations(final VariantContext VC, final boolean createRefGTs) {
        final GenotypesContext oldGTs = VC.getGenotypes();
        final List<Genotype> recoveredGs = new ArrayList<>(oldGTs.size());
        for ( final Genotype oldGT : oldGTs ) {
            final Map<String, Object> attrs = new HashMap<>(oldGT.getExtendedAttributes());

            final GenotypeBuilder builder = new GenotypeBuilder(oldGT);
            int depth = oldGT.hasDP() ? oldGT.getDP() : 0;

            // move the MIN_DP to DP
            if ( oldGT.hasExtendedAttribute("MIN_DP") ) {
                depth = Integer.parseInt((String)oldGT.getAnyAttribute("MIN_DP"));
                builder.DP(depth);
                attrs.remove("MIN_DP");
            }

            // remove SB
            attrs.remove("SB");

            // create AD if it's not there
            if ( !oldGT.hasAD() && VC.isVariant() ) {
                final int[] AD = new int[VC.getNAlleles()];
                AD[0] = depth;
                builder.AD(AD);
            }

            if ( createRefGTs ) {
                final int ploidy = oldGT.getPloidy();
                final List<Allele> refAlleles = new ArrayList<>(ploidy);
                for ( int i = 0; i < ploidy; i++ )
                    refAlleles.add(VC.getReference());
                builder.alleles(refAlleles);

                // also, the PLs are technically no longer usable
                builder.noPL();
            }

            recoveredGs.add(builder.noAttributes().attributes(attrs).make());
        }
        return recoveredGs;
    }

    /**
     * Creates a UnifiedArgumentCollection with appropriate values filled in from the arguments in this walker
     * @return a complete UnifiedArgumentCollection
     */
    private UnifiedArgumentCollection createUAC() {
        UnifiedArgumentCollection uac = new UnifiedArgumentCollection();
        uac.genotypeArgs = genotypeArgs.clone();
        return uac;
    }

    public VariantContextWriter reduceInit() {
        return vcfWriter;
    }

    public VariantContextWriter reduce(final VariantContext vc, final VariantContextWriter writer) {
        if ( vc != null )
            writer.add(vc);
        return writer;
    }

    @Override
    public VariantContextWriter treeReduce(final VariantContextWriter lhs, final VariantContextWriter rhs) {
        return lhs;
    }

    @Override
    public void onTraversalDone(final VariantContextWriter writer) {}
}
