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

package org.broadinstitute.sting.gatk.walkers.andrey.utils;

import org.broadinstitute.sting.utils.collections.PrimitivePair;
import org.broadinstitute.sting.utils.exceptions.StingException;
import org.broadinstitute.variant.utils.BaseUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
* User: asivache
* Date: Aug 3, 2010
* Time: 1:31:15 PM
* To change this template use File | Settings | File Templates.
*/
class KmerIndex {
   private HashMap<Integer,List<Integer> > lookup;
   private int K = -1;
   private int mask = 0;
   private boolean debug = false;

    /**
     *  Translates sequence <code>seq</code> into the list of all valid kmers paired
     * with their offsets on that sequence. Valid kmer is a kmer that contains only ACGT bases; if <code>seq</code>
     * contains any other symbols, no kmers overlapping with such symbols will be generated. This method
     * returns a linear (possibly gapped if non-ACGT symbols are present) representation of the sequence as its kmers
     * with corresponding offsets, NOT a lookup index. If a specific kmer occurs on the sequence N times,
     * the returned list will have N occurences of this kmer, each paired with one unique location on the sequence.
     * Kmers themselves are represented as integer kmer ids here, see #idToSeq() if string (ACGT bases) representation
     * of kmers is needed. Empty list if returned if no valid kmers are found on the sequence (i.e. too many non-ACGT bases)
     *
     * @param K key (kmer) length
     * @param seq sequence to translate into kmer/offset representation
     * @return list of kmer/offsets
     */
    public static List<PrimitivePair.Int> toKeyOffsetList(int K, byte seq[]) {
       return toKeyOffsetList(K,seq,0,seq.length);
    }

    /** Same as #toKeyOffsetList(int K, byte [] seq) (see docs), except that this method is not static and
     * uses key length K associated with the specific instance of the KmerIndex class.
     * @param seq
     * @return
     */
    public List<PrimitivePair.Int> toKeyOffsetList(byte [] seq) {
        return toKeyOffsetList(this.K,seq);
    }

    /** Returns an ordered sequence of overlapping (1-shift in the ideal case) k-mers of length K found in the subsequence of
     * length <code>length</code> of sequence <code>seq</code> starting at position <code>start</code>. All returned kmers
     * are fully subsumed by the interval [start, start+length) on the sequence <code>seq</code> (no partial overlaps).
     * Each kmer is paired with its offset on the (full length) <code>seq</code> in the returned list.
     * Note that only k-mers on the forward strand are returned. You need to manually rc the string and
     * call toKeyOffsetList() again to get rc k-mers. If sequence contains any other symbols than ACGT, all k-mers
     * that would overlap with those symbols will be skipped (not present in the returned list). See also
     * #toKeyOffsetList(int K, byte [] seq) which translates the whole sequence <code>seq</code>.
     *
     * @param K index key (k-mer) length
     * @param seq sequence to compute k-mers from
     * @param start compute kmers for subsequence [start, start+length) of <code>seq</code>
     * @param length compute kmers for subsequence [start, start+length) of <code>seq</code>
     * @return a list of pairs (kmer,offset_on_the_seq) for each valid kmer (i.e. kmer that does not overlap with
     * non-ACGT bases); if no valid kmers exist, the returned list will be empty.
     */
     public static List<PrimitivePair.Int> toKeyOffsetList(int K, byte[] seq, int start, int length) {

       if ( length < K ) throw new StingException("Can not index sequence that is shorter than key length: total seq="+seq.length+"; start="+start+"; length="+length);

       int mask = 0;
       if ( length > K ) {
           for ( int i = 0; i < K ; i++ ) {
               mask <<= 2;
               mask |= 0x03;
           }
       }

       int key = 0;
       int i ;
       final int final_pos = start+length; // first base *after* the last position we want to index

       ArrayList<PrimitivePair.Int> l = new ArrayList<PrimitivePair.Int>(length-K+1);

       PrimitivePair.Int firstK = toFirstKey(K,seq,start,final_pos);
       if ( firstK == null ) {
           // ooops, too many non-ACGT bases, we were not able to find a single valid k-mer on the whole sequence!
           return l;
       }

       l.add(firstK);

       start = firstK.getSecond();
       i = start + K; // i points to the first base after the returned kmer firstK
       key = firstK.getFirst();

       // now let's try recomputing next kmers in an efficient way: we reuse previous kmer and add only the new last base.
       // This will break if we encounter a non-ACGT base, in which case we will have to start over.

       for ( start++ ; i < final_pos ; i++, start++ ) {
           int d = BaseUtils.simpleBaseToBaseIndex(seq[i]);
           if ( d == -1 ) {
               // ooops, we ran into a bad base; let's jump over it completely and reinitialize the key
               // (since all kmers overlapping with the current base are invalid)
               firstK = toFirstKey(K,seq,i+1,final_pos);
               if ( firstK == null ) break; // no more valid kmers
               l.add(firstK);
               start = firstK.getSecond();
               i = start+K; // points to the base right after the Kmer we just found
               key = firstK.getFirst(); // reset key to the new kmer we just found
           } else {
               // the base is good, so we can compute our new kmer very efficiently using the old one:
               key <<= 2;
               key &= mask;
               key += d;
               l.add(new PrimitivePair.Int(key,start));
           }
       }
       return l;
   }

    /** Non-static version of #toKeyOffsetList(int K, byte [] seq, int start, int length) (see docs), which
     * uses key length K associated with this instance of the KmerIndex object.
     * @param seq
     * @param start
     * @param length
     * @return
     */
   public List<PrimitivePair.Int> toKeyOffsetList(byte[] seq, int start, int length) {
       return toKeyOffsetList(this.K,seq,start,length);
   }


    /** Computes index (key) of the first valid kmer in the interval [start,stop) of the sequence seq. Kmer is valid
     * if it contains only valid (ACGT) bases. Returns key and actual offset of first such kmer found, or null
     * if such kmer does not exist (i.e. if seq does not contain a continuous span of ACGT bases at least K bases long).
      * @param K
     * @param seq
     * @param start
     * @param stop
     * @return
     */
   private static PrimitivePair.Int toFirstKey(int K, byte[] seq, int start, int stop) {
       int d = -1;
       int key = 0 ;
       while ( d == -1 && start < stop - K + 1) {
           key = 0;
           for ( int i = start ; i < start+K; i++ ) {
               key <<= 2;
               d = BaseUtils.simpleBaseToBaseIndex(seq[i]);
               if ( d == -1) {
                   // ooops, non-ACGT base found, abort and start over. Next kmer that
                   // have a chance to be valid (contain only ACGT bases) can start only after the current position:
                   start = i+1;
                   break;
               }
               key += d;
           }
       } // got the first key

       if ( d != -1 ) return new PrimitivePair.Int(key,start);
       else return null;
   }

    /** Creates an empty kmer index table with specified key length
     *
     * @param K
     */
   public KmerIndex(final int K) {
       if ( K > 16 ) throw new StingException("Lookup keys longer than 16 bases are currently not supported");
       if ( K % 2 == 0 ) throw new StingException("Even keys require additional processing of palindromes, currently not supported. Please use odd key.");
       this.K = K;

       mask = 0;
       for ( int i = 0; i < K; i++ ) {
           mask <<= 2;
           mask |= 0x03;
       } // got the first key

       lookup = new HashMap<Integer,List<Integer>>();
   }

    /** Builds kmer index table with key length <code>K</code> for the sequence <code>seq</code>.
     *
     * @param K
     * @param seq
     */
   public KmerIndex(final int K, final byte[] seq) {
       this(K);

       if ( seq.length < K ) throw new StingException("Sequence is shorter than requested lookup index key length");

       addToIndex(toKeyOffsetList(K,seq,0,seq.length));
   }

    public void setDebug(boolean d) { this.debug = d; }

    /** Clears current lookup index table completely (but preserves the key length previously set).
     *
     */
   public void clear() { lookup.clear(); }

    /** Builds complete index for the sequence seq. This method can be used only when lookup table is
     * empty (i.e. use #clear() first), otherwise an exception will be thrown.
     * @param seq
     */
   public void index(final byte[] seq) {
       if ( ! lookup.isEmpty() ) {
           throw new StingException("Can not index new sequence: lookup table is already non-empty");
       }
       addToIndex(toKeyOffsetList(K,seq,0,seq.length));
   }

    /**
     * Updates existing index. It is assumed that the sequence that was already indexed by this KmerIndex object is
     * the exact subsequence of length <code>old_length</code> of the new sequence <code>seq</code>, starting at
     * position <code>old_start</code>. No checks are performed, so it is the responsibility of the caller to ensure
     * that this is indeed the case, otherwise the index will be inconsistent. Since the old sequence is a part
     * of the new one, this method will keep all the already computed kmers (and update their offsets as needed),
     * and compute and add kmers/offsets for all the novel bases added to the sequence <code>seq</code> compared
     * to the old, already indexed subsequnce. If <code>old_length</code> is less than
     * K (i.e. old sequence could not be and was not indexed at all), the new sequence <code>seq</code> will
     * be fully indexed from start to end.
      * @param seq
     * @param old_start already indexed subsequence starts at this position in <code>seq</code>
     * @param old_length length of the already indexed subsequence
     */
   public void updateIndex(final byte[] seq, final int old_start, final int old_length) {

       if ( old_length < K ) {
           if ( ! lookup.isEmpty())
               throw new StingException("It is claimed that old indexed sequence is shorter than K (i.e. it could not be indexed), but index is non empty");
           addToIndex( toKeyOffsetList(K,seq,0,seq.length));
           return;
       }

       if ( old_start > 0 ) {
           // update positions of previously indexed k-mers:
           for ( Map.Entry<Integer,List<Integer>> e : lookup.entrySet() ) {
               List<Integer> l = e.getValue();
               for ( int i = 0 ; i < l.size(); i++ ) l.set(i,l.get(i)+old_start);
           }
           // take care of additional k-mers appearing *before* the already indexed subsequence:
           // if already indexed subsequence starts at 'start', the first k-mer from that sequence
           // ends at start+K-1 (inclusive) and it is obviously already indexed. So the last k-mer we want to index now ends at
           // start+K-2 (inclusive), the length of [0,start+K-2] interval that we need to index is
           // start+K-1.
           addToIndex( toKeyOffsetList(K,seq,0,old_start+K-1) );
       }

       // the last k-mer we already indexed ends at start+length-1 (inclusive); so it starts at start+length-1-(K-1)=start+length-K.
       // Hence, the first k-mer that is not indexed yet starts at start+length-K+1. The length of the subsequence that
       // we need to index, [start+length-K+1,seq.length) is seq.length - start - length +K - 1

       int pos = old_start+old_length-K+1;
       addToIndex( toKeyOffsetList(K,seq,pos,seq.length-pos) );


   }

    /** Convenience shortcut: takes the list of keys/offsets and pushes offsets into the lookup index for the keys that
     * do exist already, or first creates the new entry and then pushes the offset for keys that are novel. This method
     * is quiet: if <code>keys</code> is <code>null</code> or an empty list, it does nothing.
     * @param keys
     */
   private void addToIndex(final List<PrimitivePair.Int> keys ) {
       if ( keys == null ) return;
       for ( PrimitivePair.Int key: keys ) {
           List<Integer> l = lookup.get(key.getFirst());
           if ( l == null ) {
               l = new ArrayList<Integer>();
               lookup.put(key.getFirst(),l);
           }
           l.add(key.getSecond());
       }

   }

    /**
     * Converts kmer (integer key) of length K into its sequence representation. Returns a sequence (over ACGT alphabet)
     * of length K that corresponds to the specified key.
     * @param K
     * @param kmer
     * @return
     */
   public static byte [] idToSeq(int K, int kmer) {
       byte [] seq = new byte[K];
       for ( int i = K-1; i >=0 ; i-- ) {
           seq[i] = BaseUtils.baseIndexToSimpleBase(kmer & 0x3);
           kmer >>= 2;
       }
       return seq;
   }

    /** Returns all offsets for the specified kmer (key) on the sequence indexed by this KmerIndex object. Returns
     * null if specified kmer is not present on the indexed sequence.
     * @param key
     * @return
     */
   public List<Integer> getOffsets(int key) { return lookup.get(key); }
//   public List<Integer> getOffsets(byte[] seq) {
//       if ( seq.length != K ) throw new StingException("Can not perform direct lookup of a sequence with length different from key size");
//
//       return getOffsets( toKey(seq) ) ;
//   }
}