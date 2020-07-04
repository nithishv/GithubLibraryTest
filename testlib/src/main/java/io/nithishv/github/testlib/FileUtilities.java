package io.nithishv.github.testlib;

import android.net.Uri;
import android.webkit.MimeTypeMap;

import org.apache.commons.io.FilenameUtils;

public class FileUtilities {

    public FileUtilities() {

    }

    /**
     * <h3>Get MIME type of a file</h3>
     * <p>Returns the MIME type of a file by mapping its extension.</p>
     *
     * @param filename Name of the file
     * @return MIME type if filename is valid, else returns null
     */
    public String getMimeType(String filename) {
        String type = null;
        String extension = MimeTypeMap.getFileExtensionFromUrl(filename);
        if (extension != null) {
            type = MimeTypeMap.getSingleton()
                    .getMimeTypeFromExtension(extension);
        }
        return type;
    }

    /**
     * <h3>This method returns a given file's name</h3>
     *
     * @param filePath Absolute file path who's name is wanted
     * @return filename if filepath is valid
     */
    public String getFilenameFromPath(String filePath) {
        return FilenameUtils.getName(filePath);
    }

    /**
     * <h3>Get File Extension</h3>
     * <p>Get the file's extension from the file name</p>
     *
     * @param filename Valid filename with extension.
     * @return Extension of the file if valid
     */
    public String getFileExtension(String filename) {
        return FilenameUtils.getExtension(filename);
    }


    /**
     * <h3>Get Base File Name</h3>
     * <p>Get the file's base name without it's extension</p>
     *
     * @param filename Valid filename
     * @return Base name of the file
     */
    public String getBaseFilename(String filename) {
        return FilenameUtils.getBaseName(filename);
    }
}
