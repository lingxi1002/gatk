package org.broadinstitute.sting.gatk.iterators;

import net.sf.samtools.SAMRecord;
import net.sf.samtools.util.RuntimeIOException;

import java.util.Iterator;

import org.broadinstitute.sting.utils.GenomeLoc;
import org.broadinstitute.sting.utils.Utils;

/**
 * Created by IntelliJ IDEA.
 * User: mdepristo
 * Date: Mar 15, 2009
 * Time: 6:02:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class VerifyingSamIterator implements Iterator<SAMRecord> {
    Iterator<SAMRecord> it;
    SAMRecord last = null;
    boolean checkOrderP = true;

    public VerifyingSamIterator(Iterator<SAMRecord> it) {
        this.it = it;
    }

    public boolean hasNext() { return this.it.hasNext(); }
    public SAMRecord next() {

        SAMRecord cur = it.next();
        if ( last != null )
            verifyRecord(last, cur);
        last = cur;
        return cur;
    }

    public void verifyRecord( final SAMRecord last, final SAMRecord cur ) {
        if ( checkOrderP ) {
            GenomeLoc lastLoc = Utils.genomicLocationOf( last );
            GenomeLoc curLoc = Utils.genomicLocationOf( cur );

            //System.out.printf("VerifyingRecords %s %s%n", lastLoc, curLoc );

            if ( curLoc.compareTo(lastLoc) == -1 )
                throw new RuntimeIOException(String.format("Reads are out of order:%nlast:%n%s%ncurrent%n%s%n", last.format(), cur.format()) );
        }
    }

    public void remove() {
        throw new UnsupportedOperationException("Can not remove records from a SAM file via an iterator!");
    }
}
