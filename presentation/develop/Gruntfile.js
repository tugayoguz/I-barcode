module.exports = function(grunt) {
    'use strict';

    //load tasks
    require('load-grunt-tasks')(grunt);

    // Project configuration.
    grunt.initConfig({
        pkg: grunt.file.readJSON('package.json'),

        /**
         * Minify CSS files
         *
         */
        cssnano: {
            options: {
                sourcemap: false,
                discardComments: true,
                reduceIdents: false,
                zindex: false
            },
            dist: {
                files: {
                    '<%= pkg.themeCSS %>dmis.min.css': ['<%= pkg.themeCSS %>dmis.css']
                }
            }
        },

        /**
         * Apply several post-processors to your CSS using PostCSS.
         *
         */
        postcss: {
            options: {
                map: false, // inline sourcemaps
                processors: [
                    require('pixrem')(), // add fallbacks for rem units
                    require('autoprefixer')({cascade: false, browsers: 'last 2 versions'})
                ]
            },
            dist: {
                src: '<%= pkg.themeCSS %>/dmis.css'
            }
        },

        /**
         * Sort CSS Lines
         *
         */
        csscomb: {
            options: {
                config: 'less/.csscomb.json'
            },
            dist: {
                files: {
                    '<%= pkg.themeCSS %>dmis.css': ['<%= pkg.themeCSS %>dmis.css']
                }
            }
        },

        /**
         * Compile LESS files
         *
         */
        less: {
            compileCore: {
                options: {
                    strictMath: true
                },
                src: 'less/style.less',
                dest: '<%= pkg.themeCSS %>dmis.css'
            }
        },

        /**
         * Watch actions
         *
         */
        watch: {
            less: {
                files: ['less/**/*.less'],
                tasks: ['less:compileCore', 'csscomb:dist', 'postcss:dist', 'cssnano:dist']
            }
        }

    });

    // Default task(s).
    grunt.registerTask('default', ['watch']);
};