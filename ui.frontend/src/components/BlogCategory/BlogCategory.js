import React from 'react';
import { MapTo } from '@adobe/aem-react-editable-components';
require('./BlogCategory.css')
export const CustomEditConfig = {
    emptyLabel: 'Blog Category',
    isEmpty: function(props) {
        return !props || !props.blogCategory || props.blogCategory.length === 0;
    }
};
export default function BlogCategory(props) {
    console.log('Blog Categories:', props.blogCategory);

    const blogCategoryItems = Array.isArray(props.blogCategory) ? props.blogCategory : [];

    if (CustomEditConfig.isEmpty(props)) {
        return <div><h1>Hello</h1></div>;
    }

     return (
             <section className="blog-tiles">
                 <p style={{ padding: 0, marginBottom: '20px' }}>Categories :</p>
                 <div className="categoriesList">
                     {blogCategoryItems.map((item, index) => (
                         <div key={index}>
                             <a className="blog-button active">{item.categoryName}</a>
                         </div>
                     ))}
                 </div>
             </section>
         );
 }

// Map the BlogList component to the AEM component type
MapTo('spa-react/components/content/blogCategory')(BlogCategory, CustomEditConfig);
