/*******************************************************************************
 * Copyright (c) 2014 Luis M. Gallardo D..
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 *
 * Contributors:
 *     Luis M. Gallardo D.
 ******************************************************************************/
package com.lgallardo.qbittorrentclientpro;

import java.util.Comparator;

public class TorrentNameComparator implements Comparator<Torrent> {

    @Override
    public int compare(Torrent t1, Torrent t2) {
        String name1 = t1.getFile();
        String name2 = t2.getFile();

        // Ascending order (descending order would be: name2.compareTo(name1))
        return name1.compareTo(name2);

    }


}