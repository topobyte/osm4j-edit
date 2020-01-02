// Copyright 2019 Sebastian Kuerten
//
// This file is part of osm4j.
//
// osm4j is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// osm4j is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with osm4j. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.osm4j.edit;

import java.io.IOException;
import java.net.URISyntaxException;

import javax.xml.parsers.ParserConfigurationException;

public class TestDeleteWay
{

	public static void main(String[] args)
			throws IOException, URISyntaxException, ParserConfigurationException
	{
		System.out.println("trying to delete a way");
		Api api = TestUtil.createApi();
		Changeset changeset = api.createChangeset();
		System.out.println("created changeset " + changeset.getId());
		RequestResult result = api.deleteWay(changeset, 4305498537L, 1);
		System.out.println("deleted? " + result.isSuccessful());
		boolean success = api.closeChangeset(changeset);
		System.out.println("closed? " + success);
	}

}
